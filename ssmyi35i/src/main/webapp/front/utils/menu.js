const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"buttons":["查看","删除","查看评论"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜品分类","menuJump":"列表","tableName":"caipinfenlei"}],"menu":"菜品分类管理"},{"child":[{"buttons":["查看","删除"],"menu":"购买菜品","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品管理"},{"child":[{"buttons":["查看","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"订单领取","menuJump":"列表","tableName":"dingdanlingqu"}],"menu":"订单领取管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"购买菜品列表","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品模块"},{"child":[{"buttons":["查看"],"menu":"订单信息列表","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","购买"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","支付"],"menu":"购买菜品","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品管理"},{"child":[{"buttons":["查看","订单领取"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看"],"menu":"订单领取","menuJump":"列表","tableName":"dingdanlingqu"}],"menu":"订单领取管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"购买菜品列表","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品模块"},{"child":[{"buttons":["查看"],"menu":"订单信息列表","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"菜品信息","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息管理"},{"child":[{"buttons":["查看","订单信息","删除"],"menu":"购买菜品","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品管理"},{"child":[{"buttons":["查看","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"订单领取","menuJump":"列表","tableName":"dingdanlingqu"}],"menu":"订单领取管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"菜品信息列表","menuJump":"列表","tableName":"caipinxinxi"}],"menu":"菜品信息模块"},{"child":[{"buttons":["查看"],"menu":"购买菜品列表","menuJump":"列表","tableName":"goumaicaipin"}],"menu":"购买菜品模块"},{"child":[{"buttons":["查看"],"menu":"订单信息列表","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"商家","tableName":"shangjia"}]
    }
}
export default menu;