package com.example.portalcategory.domain.models.mainCategory

enum class PropertyTitle (val title: String,val key:String) {
    Main("Main Category","Main"),
    Sub("Sub Categories","Sub"),
    ProcessType("Process Type","process-type"),
    Brand("Brand","brand"),
    Model("Model","model"),
    Type("Type","type"),
    TransmissionType("Transmission Type","transmission-type"),
    FuelType("Fuel Type","fuel-type")
}