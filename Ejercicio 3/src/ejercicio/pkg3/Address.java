/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author Andrea
 */
public class Address {

    private String house;
    private String county;
    private String postcode;

    public Address(String house, String county, String postcode) {
        this.house = house;
        this.county = county;
        this.postcode = postcode;
    }

    public String getHouse() {
        return house;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postcode;
    }

    /*   
    public void setHouse(String house) {
        this.house = house;
    }


    public void setCounty(String county) {
        this.county = county;
    }


    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }*/
}
