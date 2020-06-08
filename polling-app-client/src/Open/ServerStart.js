import http from "./server-http"

class ServerStart{
    
    serviceStart(){
        return http.post("/run")
    }
    serverDown(username){
        return http.post("/run?user=" + username)
    }
}

export default new ServerStart();