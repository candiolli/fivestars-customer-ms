//package com.fivestars.customer.usecases;
//
//import com.fivestars.customer.data.model.Customer;
//import com.fivestars.customer.data.repository.CustomerRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//class CustomerRegisterTest {
//
//    @InjectMocks
//    private CustomerRegister customerRegister;
//
//    @Mock
//    private CustomerRepository repository;
//
//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @DisplayName("Register a new customer")
//    @Test
//    void register_success() {
//        Customer objectSaved = new Customer("111");
//
//        when(repository.save(any(Customer.class))).thenReturn(objectSaved);
//
//        CustomerVO vo = CustomerVO.builder()
//                .cpf("8998989898")
//                .name("Silas")
//                .rg(123456L)
//                .build();
//
//        Customer register = customerRegister.register(vo);
//        Assertions.assertEquals(objectSaved.getId(), register.getId());
//    }
//}