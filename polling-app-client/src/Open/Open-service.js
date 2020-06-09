import http from "./open-http"

class OpenService{
    
    openupload(username, userkey){
        return http.post("start?user=" + username +"&userKey="+userkey)
    }

    opendelte(tablename,userkey){
        return http.delete(tablename + "/delete?key=" + userkey)
    }
}
export default new OpenService();