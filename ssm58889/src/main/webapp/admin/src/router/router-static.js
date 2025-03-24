import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussluxianjieshao from '@/views/modules/discussluxianjieshao/list'
    import luxianjieshao from '@/views/modules/luxianjieshao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import menpiaogoumai from '@/views/modules/menpiaogoumai/list'
    import chat from '@/views/modules/chat/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import piaowuxinxi from '@/views/modules/piaowuxinxi/list'
    import discusspiaowuxinxi from '@/views/modules/discusspiaowuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '游乐园信息',
        component: news
      }
      ,{
	path: '/discussluxianjieshao',
        name: '路线介绍评论',
        component: discussluxianjieshao
      }
      ,{
	path: '/luxianjieshao',
        name: '路线介绍',
        component: luxianjieshao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/menpiaogoumai',
        name: '门票够买',
        component: menpiaogoumai
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/piaowuxinxi',
        name: '票务信息',
        component: piaowuxinxi
      }
      ,{
	path: '/discusspiaowuxinxi',
        name: '票务信息评论',
        component: discusspiaowuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
