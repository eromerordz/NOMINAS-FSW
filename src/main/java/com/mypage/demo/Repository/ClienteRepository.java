package com.mypage.demo.Repository;

import com.mypage.demo.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    /***
     *
     * @param nombreCli
     * @return
     */
    public Cliente findByNombreCli(String nombreCli);
}
