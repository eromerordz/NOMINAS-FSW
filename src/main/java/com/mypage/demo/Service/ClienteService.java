package com.mypage.demo.Service;

import com.mypage.demo.Repository.ClienteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(readOnly = true)
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository)(this.clienteRepository=clienteRepository;)
    @Transactional
    public Cliente create(Cliente cliente)
}
