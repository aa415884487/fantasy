import Vue from 'vue'
import Router from 'vue-router'
import login from '../views/login/login'
import home from '../views/home'
import score from '../views/score/score'
import course from '../views/course/course'
import dashboard from '../views/dashboard/index'
import account from '../views/account/account'
import student from '../views/student/student'
import teacher from '../views/teacher/teacher'
import admin from '../views/admin/admin'
import timetable from '../views/timetable/timetable'
import analysis from '../views/analysis/index'
import attence from '../views/attence/attence'
import error from '../common/error/error'
import department from "../views/department/department"

// 导航栏点击点击多次报错警告处理
const originalPush = Router.prototype.push;
Router.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
};

Vue.use(Router);
export default new Router({
  routes: [
    {
      path: '/404',
      name: 'error',
      component: error,
    }, {
      path: '/login',
      name: 'login',
      component: login,
    }, {
      path: '/home',
      name: 'home',
      component: home,
      redirect: '/dashboard',
      children: [
        {
          path: '/dashboard',
          name: '主页',
          meta: { requireAuth: true },
          component: dashboard
        },
        {
          path: '/score',
          name: '成绩查询',
          meta: { requireAuth: true },
          component: score,
        }, {
          path: '/account',
          name: '账号管理',
          meta: { requireAuth: true, level: 0},
          component: account,
        }, {
          path: '/course',
          name: '课程录入',
          meta: { requireAuth: true, level: 0},
          component: course,
        }, {
          path: '/student',
          name: '学生用户',
          meta: { requireAuth: true, level: 0},
          component: student,
        }, {
          path: '/teacher',
          name: '教师用户',
          meta: { requireAuth: true, level: 0},
          component: teacher,
        }, {
          path: '/admin',
          name: '管理员用户',
          meta: { requireAuth: true, level: 0},
          component: admin,
        }, {
          path: '/timetable',
          name: '课程表',
          meta: { requireAuth: true},
          component: timetable,
        }, {
          path: '/analysis',
          name: '成绩详情',
          meta: { requireAuth: true},
          component: analysis,
        },
         {
          path: '/attence',
          name: '学生考勤',
          meta: { requireAuth: true},
          component: attence,
        },
        {
          path: '/department',
          name: '学员管理',
          meta: { requireAuth: true},
          component: department,
        }
      ]
    }
  ]
})
