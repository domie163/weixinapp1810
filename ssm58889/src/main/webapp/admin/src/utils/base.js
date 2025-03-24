const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm58889/",
            name: "ssm58889",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm58889/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "游乐园智慧向导小程序"
        } 
    }
}
export default base
