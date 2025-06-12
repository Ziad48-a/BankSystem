package bank;

import java.util.ArrayList;

public class CIBBank {

    // singleton Class
    CIBBank cib ;

    // Attributes
    private String name ;
    private int bankID;
    private String location;
    ArrayList<Customer> customers =new ArrayList<>(10);


    // constructor
    private  CIBBank(){}

    //singleton implementation
    public CIBBank getCIB(){
        if(cib==null)
            cib=new CIBBank() ;

        return cib;
    }

    //methods
    Customer getCustomerByID(int id){
        Customer targetCustomer=null ;
        for (int i=0 ;i< customers.size();i++){
            if(id==customers.get(i).id)
                targetCustomer= customers.get(i);
        }
       return  targetCustomer ;
    }




}
