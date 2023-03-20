package com.hjf.sms.controller.Upload;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hjf.sms.domain.Upload;
import com.hjf.sms.service.Upload.UploadService;
import com.hjf.sms.utils.UserLoginToken;

/**
 * Description 上传控制层
 **/
@RestController
@RequestMapping("/api/sms/upload")
public class UploadController {
  @Autowired
  private UploadService uploadService;

  @PostMapping("/headImg")
  @ResponseBody
  public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
    if (!file.isEmpty()) {
      try {
        byte[] bytes = file.getBytes();
        // 储存位置
        String url = "sms/static/img/";
        // 图片名
        String ImgName = file.getOriginalFilename();

        String uid = UUID.randomUUID().toString();
        assert ImgName != null;
        // 获取后缀名
        String str = ImgName.substring(ImgName.lastIndexOf("."));
        // 重定义文件名
        String newName = uid + str;

        // 图片存储地址
        String imgUrl = url + newName;
        Path path = Paths.get(imgUrl);
        // 写入文件
        Files.write(path, bytes);

        String userId = request.getParameter("id");
        int level = parseInt(request.getParameter("level"));
        Upload upload = new Upload();
        upload.setUserId(userId);
        upload.setLevel(level);
        upload.setUrl(imgUrl);
        uploadService.upload(upload);

        // url去除"sms"
        return imgUrl.substring(imgUrl.indexOf("/"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return "";
  }

  @GetMapping("/getHeadImg")
  @UserLoginToken
  public String getAdminList (@RequestParam Map<String, Object> condition, HttpServletRequest httpServletRequest) {
    return uploadService.getHeader(condition);
  }
}
