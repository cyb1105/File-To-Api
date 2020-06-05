import http from "./server-http"

class ServerStart{
    
    serviceStart(){
        return http.post("/run")
    }
}

export default new ServerStart();