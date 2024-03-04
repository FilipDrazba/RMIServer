package pl.edu.pb.wi.fd;

import java.util.List;

public interface IConnection {
    static IConnection getInstance(){
        return new Database();
    }

    List<String> findAll();
    List<String> findAllByName(String name);
}
