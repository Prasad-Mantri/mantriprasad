/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Shelf.Shelf;
import Business.Shelf.ShelfDirectory;
import Business.Item.ShelfItem;
/**
 *
 * @author Prasad
 */
public class InitializeProductClasses {
    
    private ProductCatalog productlist;
    private ShelfDirectory shelfDirectory;
    public InitializeProductClasses()
{
    Product p1 = new Product("Sugar packet",50, (float) 5.0,"Star");
    Product p2 = new Product("Bread",50, (float) 2.0,"Star");
    Product p3 = new Product("Cornflakes",50, (float) 3.50,"Kellogs");
    Product p4 = new Product("Noodles",50, (float) 10.0,"Maggi");
    Product p5 = new Product("Oil",50, (float) 15.0,"Dhara");
    Product p6 = new Product("Milk Can",50, (float) 5.0,"Hood");
    Product p7 = new Product("Salt",50, (float) 1.5,"Tata");
    Product p8 = new Product("Rice",50, (float) 11.4,"Tilda");
    
    
    
    Product p9 = new Product("Detergent",50, (float) 3.8,"Surf");
    Product p10 = new Product("BodyWash",50, (float) 7.6,"Dove");
    Product p11 = new Product("HandWash",50, (float) 3.9,"Dettol");
    Product p12 = new Product("Body Soap",50, (float) 2.7,"Godrej");
    Product p13 = new Product("Hair Oil",50, (float) 3.0,"Parachute");
    Product p14 = new Product("Shampoo",50, (float) 10.0,"Sunsilk");
    Product p15 = new Product("Conditioner",50, (float) 15.0,"Dove");
    Product p16 = new Product("Shaving gel",50, (float) 5.6,"Gillete");

    
    
    Product p17 = new Product("Mobile",50, (float) 250.0,"Samsung");
    Product p18 = new Product("USB Pendrive",50, (float) 8.2,"SanDisk");
    Product p19 = new Product("HardDisk",50, (float) 25.0,"WD");
    Product p20 = new Product("Powerbank",50, (float) 15.7,"Sony");
    Product p21 = new Product("HeadPhones",50, (float) 20.9,"RCC");
    Product p22 = new Product("Watches",50, (float) 30.5,"Titan");
    Product p23 = new Product("Speakers",50, (float) 60.0,"RCC");
    Product p24 = new Product("Mouse",50, (float) 12.8,"RCC");
    
    productlist = new ProductCatalog();
    productlist.getProductList().add(p1);
    productlist.getProductList().add(p2);
    productlist.getProductList().add(p3);
    productlist.getProductList().add(p4);
    productlist.getProductList().add(p5);
    productlist.getProductList().add(p6);
    productlist.getProductList().add(p7);
    productlist.getProductList().add(p8);
    productlist.getProductList().add(p9);
    productlist.getProductList().add(p10);
    productlist.getProductList().add(p11);
    productlist.getProductList().add(p12);
    productlist.getProductList().add(p13);
    productlist.getProductList().add(p14);
    productlist.getProductList().add(p15);
    productlist.getProductList().add(p16);
    productlist.getProductList().add(p17);
    productlist.getProductList().add(p18);
    productlist.getProductList().add(p19);
    productlist.getProductList().add(p20);
    productlist.getProductList().add(p21);
    productlist.getProductList().add(p22);
    productlist.getProductList().add(p23);
    productlist.getProductList().add(p24);
    
    
    Shelf s1 = new Shelf();
    Shelf s2 = new Shelf();
    Shelf s3 = new Shelf();
    
    ShelfItem i1 = new ShelfItem();
    i1.setProduct(p1);
    i1.setQuantity(20);
   
    
    ShelfItem i2 = new ShelfItem();
    i2.setProduct(p2);
    i2.setQuantity(20);
    
    ShelfItem i3 = new ShelfItem();
    i3.setProduct(p3);
    i3.setQuantity(20);
    
    ShelfItem i4 = new ShelfItem();
    i4.setProduct(p4);
    i4.setQuantity(20);
    
    ShelfItem i5 = new ShelfItem();
    i5.setProduct(p5);
    i5.setQuantity(20);
    
    ShelfItem i6 = new ShelfItem();
    i6.setProduct(p6);
    i6.setQuantity(20);
    
    ShelfItem i7 = new ShelfItem();
    i7.setProduct(p7);
    i7.setQuantity(20);
    
    ShelfItem i8 = new ShelfItem();
    i8.setProduct(p8);
    i8.setQuantity(20);
    
    s1.getShelfList().add(i1);
    s1.getShelfList().add(i2);
    s1.getShelfList().add(i3);
    s1.getShelfList().add(i4);
    s1.getShelfList().add(i5);
    s1.getShelfList().add(i6);
    s1.getShelfList().add(i7);
    s1.getShelfList().add(i8);
    
    ShelfItem i9 = new ShelfItem();
    i9.setProduct(p9);
    i9.setQuantity(20);
    
    ShelfItem i10 = new ShelfItem();
    i10.setProduct(p10);
    i10.setQuantity(20);
    
    ShelfItem i11 = new ShelfItem();
    i11.setProduct(p11);
    i11.setQuantity(20);
    
    ShelfItem i12 = new ShelfItem();
    i12.setProduct(p12);
    i12.setQuantity(20);
    
    ShelfItem i13 = new ShelfItem();
    i13.setProduct(p13);
    i13.setQuantity(20);
    
    ShelfItem i14 = new ShelfItem();
    i14.setProduct(p14);
    i14.setQuantity(20);
    
    ShelfItem i15 = new ShelfItem();
    i15.setProduct(p15);
    i15.setQuantity(20);
    
    ShelfItem i16 = new ShelfItem();
    i16.setProduct(p16);
    i16.setQuantity(20);
    
    s2.getShelfList().add(i9);
    s2.getShelfList().add(i10);
    s2.getShelfList().add(i11);
    s2.getShelfList().add(i12);
    s2.getShelfList().add(i13);
    s2.getShelfList().add(i14);
    s2.getShelfList().add(i15);
    s2.getShelfList().add(i16);
    
    
    
    
    ShelfItem i17 = new ShelfItem();
    i17.setProduct(p17);
    i17.setQuantity(20);
    
    ShelfItem i18 = new ShelfItem();
    i18.setProduct(p18);
    i18.setQuantity(20);
    
    ShelfItem i19 = new ShelfItem();
    i19.setProduct(p19);
    i19.setQuantity(20);
    
    ShelfItem i20 = new ShelfItem();
    i20.setProduct(p20);
    i20.setQuantity(20);
    
    ShelfItem i21 = new ShelfItem();
    i21.setProduct(p21);
    i21.setQuantity(20);
    
    ShelfItem i22 = new ShelfItem();
    i22.setProduct(p22);
    i22.setQuantity(20);
    
    ShelfItem i23 = new ShelfItem();
    i23.setProduct(p23);
    i23.setQuantity(20);
    
    ShelfItem i24 = new ShelfItem();
    i24.setProduct(p24);
    i24.setQuantity(20);
    
    s3.getShelfList().add(i17);
    s3.getShelfList().add(i18);
    s3.getShelfList().add(i19);
    s3.getShelfList().add(i20);
    s3.getShelfList().add(i21);
    s3.getShelfList().add(i22);
    s3.getShelfList().add(i23);
    s3.getShelfList().add(i24);
    
    shelfDirectory = new ShelfDirectory();
    
    shelfDirectory.getShelfDirectory().add(s1);
    shelfDirectory.getShelfDirectory().add(s2);
    shelfDirectory.getShelfDirectory().add(s3);
    
}  

    public ProductCatalog getProductlist() {
        return productlist;
    }

    public void setProductlist(ProductCatalog productlist) {
        this.productlist = productlist;
    }

    public ShelfDirectory getShelfDirectory() {
        return shelfDirectory;
    }

    public void setShelfDirectory(ShelfDirectory shelfDirectory) {
        this.shelfDirectory = shelfDirectory;
    }



    
}