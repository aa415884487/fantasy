<!--<template>-->
<!--  <el-dialog v-dialogDrag :title="title" :visible.sync="dialog" :close-on-click-modal=false append-to-body width="800px">-->
<!--    <el-form ref="form" :model="form" :rules="rules">-->
<!--      <el-row>-->
<!--        <el-col :span="12">-->
<!--          <el-form-item label="课程名：" prop="name" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.name" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->
<!--        <el-col :span="12">-->
<!--          <el-form-item label="学分：" prop="credits" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.credits" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->
<!--      </el-row>-->
<!--      <el-row>-->
<!--        <el-col :span="12">-->
<!--          <el-form-item label="学生姓名：" prop="student_name" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.student_name" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->
<!--        <el-col :span="12">-->
<!--          <el-form-item label="课时：" prop="number" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.number" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->
<!--      </el-row>-->
<!--&lt;!&ndash;      <el-row>&ndash;&gt;-->
<!--&lt;!&ndash;        <el-col :span="12">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-form-item label="电子邮箱：" prop="email" :label-width="formLabelWidth">&ndash;&gt;-->
<!--&lt;!&ndash;            <el-input v-model="form.email" maxlength="30" clearable></el-input>&ndash;&gt;-->
<!--&lt;!&ndash;          </el-form-item>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-col>&ndash;&gt;-->
<!--&lt;!&ndash;        <el-col :span="12">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-form-item label="手机：" prop="phone" :label-width="formLabelWidth">&ndash;&gt;-->
<!--&lt;!&ndash;            <el-input v-model="form.phone" maxlength="15" clearable></el-input>&ndash;&gt;-->
<!--&lt;!&ndash;          </el-form-item>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-col>&ndash;&gt;-->
<!--&lt;!&ndash;      </el-row>&ndash;&gt;-->
<!--      <el-row>-->
<!--&lt;!&ndash;        <el-col :span="12">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-form-item label="时间：" :label-width="formLabelWidth">&ndash;&gt;-->
<!--&lt;!&ndash;            <el-select v-model="form.sex" style="width: 100%">&ndash;&gt;-->
<!--&lt;!&ndash;              <el-option v-for="item in sexArr" :key="item.value" :label="item.label" :value="item.value"></el-option>&ndash;&gt;-->
<!--&lt;!&ndash;            </el-select>&ndash;&gt;-->
<!--&lt;!&ndash;          </el-form-item>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-col>&ndash;&gt;-->

<!--        <el-col :span="12">-->
<!--          <el-form-item label="时间：" prop="time" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.time" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->

<!--        <el-col :span="12">-->
<!--          <el-form-item label="教室：" prop="address" :label-width="formLabelWidth">-->
<!--            <el-input v-model="form.address" maxlength="15" clearable></el-input>-->
<!--          </el-form-item>-->
<!--        </el-col>-->
<!--&lt;!&ndash;        <el-col :span="12">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-form-item label="时间：" prop="admissionTime" :label-width="formLabelWidth">&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            <div class="block">&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;              <el-date-picker&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;                v-model="value2"&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;                type="datetime"&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;                placeholder="选择日期时间"&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;                align="right"&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;                :picker-options="pickerOptions">&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;              </el-date-picker>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            </div>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;            <el-input v-model="form.admissionTime" maxlength="15" clearable></el-input>&ndash;&gt;-->

<!--&lt;!&ndash;          </el-form-item>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-col>&ndash;&gt;-->
<!--      </el-row>-->
<!--    </el-form>-->
<!--    <div slot="footer">-->
<!--      <el-button type="primary" @click="click('form')" size="small">确定</el-button>-->
<!--      <el-button @click="cancel" size="small" >取消</el-button>-->
<!--    </div>-->
<!--  </el-dialog>-->
<!--</template>-->








<template>
  <el-dialog v-dialogDrag :title="title" :visible.sync="dialog" :close-on-click-modal=false append-to-body width="800px">
    <el-form ref="form" :rules="rules" :model="form" label-width="90px">
      <el-row>
        <el-col :span="12">
          <el-form-item label="课程名:" prop="name">
            <el-input v-model="form.name" clearable maxlength="30"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="学分:" prop="credits">
            <el-input v-model.number="form.credits" maxlength="15" clearable oninput="value=value.replace(/[^\d.]/g,'')"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="12">
          <el-form-item label="学生姓名:" prop="student_name">
            <el-input v-model="form.student_name" clearable maxlength="30"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="课时:" prop="number">
            <el-input v-model="form.number" maxlength="15" clearable oninput="value=value.replace(/[^\d]/g,'')"></el-input>
          </el-form-item>
        </el-col>
      </el-row>

      <el-row>

        <el-col :span="12">
          <el-form-item label="时间:" prop="time">
            <!--          <el-input v-model="form.time" maxlength="15" clearable oninput="value=value.replace(/[^\d]/g,'')"></el-input>-->
            <el-date-picker clearable style="width: 100%" v-model="form.time" type="datetime" format="yyyy-MM-dd HH:mm:ss"
                            value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择时间"></el-date-picker>
          </el-form-item>
        </el-col>

        <el-col :span="12">
          <el-form-item label="教室:" prop="address">
            <el-input v-model="form.address" clearable maxlength="30"></el-input>
          </el-form-item>
        </el-col>
      </el-row>
      <el-row>

        <el-col :span="12">
          <el-form-item label="类型:" prop="type">
            <el-select v-model="form.type" style="width: 100%">
              <el-option v-for="item in typeArr" :key="item.value" :label="item.label" :value="item.value"></el-option>
            </el-select>
          </el-form-item>
        </el-col>

        <el-col :span="12">
          <el-form-item label="专业:" prop="profession">
            <el-select v-model="form.profession" style="width: 100%">
              <el-option v-for="item in professionArr" :key="item.value" :label="item.label" :value="item.label"></el-option>
            </el-select>
          </el-form-item>
        </el-col>
      </el-row>
    </el-form>
    <div slot="footer">
      <el-button type="primary" @click="click('form')" size="small">确定</el-button>
      <el-button @click="cancel" size="small">取消</el-button>
    </div>
  </el-dialog>
</template>



<script>
  export default {
    name: "student-model",
    data () {
      return {
        professionArr: [],
        doneNum: 0,
        title: '',
        termArr: [{
          value: 1,
          label: '上学期'
        }, {
          value: 2,
          label: '下学期'
        }],
        yearArr: [],
        formLabelWidth: '100px',
        dialog: false,
        typeArr: [{
          value: 1,
          label: '必修'
        }, {
          value: 2,
          label: '选修'
        }],
        form: {
          name: '',
          credits: '',
          point: '',
          score: '',
          number: '',
          year: '',
          type: 1,
          term: 1,
          profession: ''
        },
        rules: {
          name: [
            { required: true, message: '课程名不能为空', trigger: 'blur' },
          ],
          credits: [
            { required: true, message: '学分不能为空', trigger: 'blur' },
          ],
          point: [
            { required: true, message: '绩点不能为空', trigger: 'blur' },
          ],
          score: [
            { required: true, message: '满分项不能为空', trigger: 'blur' },
          ],
          number: [
            { required: true, message: '课时不能为空', trigger: 'blur' },
          ],
          profession: [
            { required: true, message: '专业名不能为空', trigger: 'change' },
          ],
        }
      }
    },
    methods: {
      init (obj) {
        this.clearForm();
        this.type = obj.type;
        if (obj.type === 'add') {
          this.title = '新增';
        } else if (obj.type === 'edit') {
          this.title = '修改';
          this.form = obj.row
        }
        this.dialog = true;
      },
      clearForm () {
        let year = new Date().getFullYear();
        this.form = {
          name: '',
          credits: '',
          student_name: '',
          number: '',
          time: '',
          address: '',
          type: 1,
          profession: this.professionArr[0].label || null
        };
        if(this.$refs['form'] !== undefined) {
          this.$refs['form'].clearValidate();
        }
      },
      click (formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            if (this.type === 'add') {
              this.addMethod();
            } else if (this.type === 'edit') {
              this.editMethod();
            }
          } else {
            return false;
          }
        })
      },
      addMethod () {
        ++this.doneNum;
        if (this.doneNum === 1) {
          this.add();
        }
      },
      add () {
        this.axiosHelper.post(
          '/api/sms/attendance', this.form).then(() => {
            this.doneNum = 0;
          this.$message.success({
            message: '新增成功'
          });
          this.dialog = false;
          this.$emit('search')
        }).catch(() => {
          this.doneNum = 0;
          this.$message.error({
            message: '新增失败'
          });
          this.dialog = false;
        });
      },
      editMethod () {
        this.axiosHelper.put(
          '/api/sms/attendance', this.form).then(() => {
          this.$message.success({
            message: '修改成功'
          });
          this.dialog = false;
          this.$emit('search')
        }).catch(() => {
          this.$message.error({
            message: '修改失败'
          });
          this.dialog = false;
        });
      },
      cancel () {
        this.dialog = false;
      },getProfession () {
        this.axiosHelper.get('/api/sms/profession/getProfessionList').then(response => {
          let data = response.data;
          this.professionArr = data.map(item => {
            return {label: item.name,value: item.name}
          });
        })
      }
    },
    created () {
      let today = new Date();
      let year = today.getFullYear();
      for (let i = 2010; i < year + 2; i++) {
        this.yearArr.push(i);
      }
      this.getProfession();
    }
  }
</script>
<style>
  html, body, #app, .login {
    height: 99%;
    padding: 0;
    margin: 0;
  }
</style>
<style scoped>
</style>
