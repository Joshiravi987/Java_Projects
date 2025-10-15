package JavaAssessment;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Product{
String p_name;
double p_price;
int p_code;
public Product(String p_name,double p_price,int p_code) {
this.p_name=p_name;
this.p_price=p_price;
this.p_code=p_code;
}
}

public class Module_4 {
 
driver_run d=new driver_run();
Connection con=d.getConnection();
public void insert() {
Scanner sc=new Scanner(System.in);
ArrayList<Product>al=new ArrayList<Product>();
System.out.println("Enter the size of Product:");
int size=sc.nextInt();
for(int i=0;i<size;i++) {
System.out.println("Enter the Product Name:");
String p_name=sc.next();
System.out.println("Enter the Product Price:");
double p_price=sc.nextDouble();
System.out.println("Enter the Product Code:");
int p_code=sc.nextInt();

al.add(new Product(p_name, p_price, p_code));

try {
PreparedStatement ps=con.prepareStatement("insert into product(p_name,p_price,p_code) values(?,?,?)");
ps.setString(1, p_name);
ps.setDouble(2, p_price);
ps.setInt(3, p_code);
int j=ps.executeUpdate();
if(j>0) {
System.out.println("Data Inserted Sucessfully....");
}
else {
System.out.println("Query Error...!");
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}
public void disp() {
try {
PreparedStatement ps=con.prepareStatement("SELECT p_name, p_price\r\n"
+ "FROM product\r\n"
+ "WHERE p_price >= 250\r\n"
+ "ORDER BY p_price DESC, p_name ASC;\r\n"
);
ResultSet rs=ps.executeQuery();
while(rs.next()) {
System.out.println("Product Name:"+rs.getString("p_name")+"\t\tProduct Price:"+rs.getDouble("p_price"));
}

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

public void cheap_item_disp() {
try {
PreparedStatement ps=con.prepareStatement("SELECT p_name, p_price\r\n"
+ "FROM product\r\n"
+ "ORDER BY p_price ASC\r\n"
+ "LIMIT 1;\r\n"
);
ResultSet rs=ps.executeQuery();
while(rs.next()) {
System.out.println("Product Name:"+rs.getString("p_name")+"\t\tProduct Price:"+rs.getDouble("p_price"));
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public void avg_code() {
try {
PreparedStatement ps=con.prepareStatement("SELECT p_code, AVG(p_price) AS average_price\r\n"
+ "FROM product\r\n"
+ "GROUP BY p_code;\r\n"
);
ResultSet rs=ps.executeQuery();
while(rs.next()) {
System.out.println("Avrage Price:"+rs.getDouble("average_price")+"\tCompany Code:"+rs.getInt("p_code"));
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void avg() {
try {
PreparedStatement ps=con.prepareStatement("select avg(p_price) as average_price from product");
ResultSet rs=ps.executeQuery();
while(rs.next()) {
System.out.println("Avarage of all Product:"+rs.getDouble("average_price"));
}
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void close() {
System.exit(0);
}
public static void main(String[] args) {
	Module_4 db=new Module_4();
Scanner sc=new Scanner(System.in);
int ch=0;
do {
System.out.println("1.Insert Data into Table");
System.out.println("2.Display Data whose price>250");
System.out.println("3.Dispay Cheapest Product item");
System.out.println("4.Avreage of Comapny code Product");
System.out.println("5.Avarage of all Product");
System.out.println("6.Exit");
System.out.println("Enter the choice(1/6):");
int choice=sc.nextInt();

switch(choice) {

case 1:
db.insert();
break;

case 2:
db.disp();
break;

case 3:
db.cheap_item_disp();
break;

case 4:
db.avg_code();
break;

case 5:
db.avg();
break;

case 6:
db.close();
break;

default:
System.out.println("Invalid choice enter by you...!");
break;
}
System.out.println("Do you want to continue press(1 for yes/0 for no):");
ch=sc.nextInt();
}while(ch==1);
}

}