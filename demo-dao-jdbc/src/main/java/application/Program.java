package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller  findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller)

        System.out.println("=== Test 2: seller  findByDepartment ===");
        Department department = new Department(2, "kaio");
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller seller1 : list){
            System.out.println(seller1);
        }

testes

    }
}
