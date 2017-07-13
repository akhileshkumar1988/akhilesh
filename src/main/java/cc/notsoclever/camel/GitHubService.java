package cc.notsoclever.camel;


import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface GitHubService {
   String getRepos(@WebParam(name="owner") String owner);
}
