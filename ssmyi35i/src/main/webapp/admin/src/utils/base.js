const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmyi35i/",
            name: "ssmyi35i",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmyi35i/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序的校园外卖平台"
        } 
    }
}
export default base
