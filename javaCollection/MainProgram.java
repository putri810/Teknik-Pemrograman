package javaCollection;

import java.util.List;
import java.lang.reflect.Type;
import java.io.FileReader;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainProgram {
	public static void main(String args[]) throws FileNotFoundException{
		int i = 0;
		int j = 0;
		
		Gson gson = new Gson();
		Type list = new TypeToken<List<Product>>(){}.getType();
		
		List<Product> listProduct = gson.fromJson(new FileReader("C:\\Users" +
		"\\zahwa\\OneDrive\\Documents\\Teknik Pemrograman\\tekpro_PR_ke-9\\barang.json"), list);
		System.out.println("Product | Price | Quantity | Weight | Origin | Destination"
				+ "| Service | Value | Total ");
		
		for(Product product : listProduct ){ 
			j = i+1;
			System.out.println(product.getProductName() + " | " + product.getPriceItem() + " | "
					+ product.getQuantity() + " | " + product.getWeight() + " | " + product.city.getOrigin() + " | "
					+ product.city.getDestination() + " | " + product.servicePackage.getService() + " | "
					+ product.servicePackage.getValue() + " | " + product.getTotal());
			i++;
		}
	}
}