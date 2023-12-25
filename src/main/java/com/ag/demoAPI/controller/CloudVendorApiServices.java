package com.ag.demoAPI.controller;

import com.ag.demoAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorApiServices {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorById(String vendorId) {
        return cloudVendor;
//                new CloudVendor("id", "Gupta ji", "", "");
    }

    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId){
        this.cloudVendor = null;

        return "Cloud Vendor deleted successfully";
    }
}