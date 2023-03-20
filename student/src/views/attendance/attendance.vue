<template>
  <el-card style="margin: 10px;padding: 15px 10px 10px 10px">
    <el-row style="margin-bottom: 10px">
      <el-button type="primary" size="small" @click="addMethod">新增</el-button>
      <el-button type="danger" size="small" @click="deleteSelect">删除</el-button>
      <el-input style="float:right;width:300px;" size="small" v-model="searchValue.code" placeholder="请输入课程名或专业" clearable @keyup.enter.native="filterData">
        <el-button slot="append" @click="filterData" type="primary">搜索</el-button>
      </el-input>
    </el-row>
    <VmBaseTable
      :setTableHigh="true"
      @on-select-change="select"
      ref="course_table"
      :data="dataTable"
      :columns="dataColumns"
      overflow
      @page-change="pageChange"
      showCheck
      showIndex
      :tableHigh="tableHigh"
    ></VmBaseTable>
    <VmCourse ref="course_model" @search="search"></VmCourse>
  </el-card>
</template>

<script>
    export default {
        name: "attendance"
    }
</script>

<style scoped>

</style>
