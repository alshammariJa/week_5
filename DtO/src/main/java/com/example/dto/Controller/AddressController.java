package com.example.dto.Controller;

import com.example.dto.DTO.AddressDto;
import com.example.dto.Model.Address;
import com.example.dto.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Address")
public class AddressController {
    private final AddressService  addressService;
    @PostMapping("/details")
    public ResponseEntity addDetails(@RequestBody AddressDto addressDto){
        addressService.addAddressDetals(addressDto);
        return ResponseEntity.status(200).body("Teacher detail added");


    }
    @PutMapping("/updatedetails")
    public ResponseEntity updateTeacherDetails(@RequestBody AddressDto addressDto) {
        addressService.updatAaddresDetails(addressDto);
        return ResponseEntity.status(200).body("Teacher details updated");

    }
    @DeleteMapping("/deletdetails/{id}")
    public ResponseEntity deleteTeacherDetails(@PathVariable Integer id){
        addressService.deleteAddressDetails(id);

        return ResponseEntity.status(200).body("Teacher details deleted");


    }
    @GetMapping("/getdetails/{id}")
    public ResponseEntity getTeacherdetails(@PathVariable Integer id,@RequestBody AddressDto addressDto){
        Address teachers =addressService.getDetails(id, addressDto);
        return ResponseEntity.status(200).body(teachers);
    }
}
