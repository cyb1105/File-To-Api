import http from "./server-http"

class ServerStart{
    
    serviceStart(username){
        return http.post("/run?user=" + username)
    }
    serverDown(username){
        return http.post("/run?user=" + username)
    }
}

export default new ServerStart();