package com.tokbox.coupons.contoller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tokbox.coupons.controller.CouponsController;
import com.tokbox.coupons.model.Coupons;
import com.tokbox.coupons.model.Product;
import com.tokbox.coupons.repository.CouponsRepo;
import com.tokbox.coupons.service.CouponService;



@RunWith(SpringRunner.class)
@ContextConfiguration(classes=CouponsController.class)
@WebMvcTest(value=CouponsController.class, secure = false)
public class CouponsControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
    @MockBean
    @Qualifier(value="orderService")
	private CouponService couponService;
    @MockBean
    private CouponsRepo couponRepo;
    
    List<Coupons> couponsList;
    List<Product> productList;
    Coupons coupon1;
    Coupons coupon2;
    
    Product product1;
    Product product2;
    Product product3;
    Product product4;
    Product product5;
    Product product6;
    Product product7;
    Product product8;
    Product product9;
    Product product10;
    Product product11;
    Product product12;
    
    @Before
	public void setup() {
    	productList=new ArrayList<Product>();
    	product1=new Product(1, "The Whistler", " The best thriller writer alive by Ken Follett", "Book", 50.00, "USD");
    	product2=new Product(2,"The Testament: A Novel","NEW YORK TIMES BESTSELLER", "Book", 50.00, "USD");
    	product3=new Product(3,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
		product4=new Product(4,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product5=new Product(5,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product6=new Product(6,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product7=new Product(7,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product8=new Product(8,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product9=new Product(9,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");		
	    product10=new Product(10,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");
	    product11=new Product(11,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");
	    product12=new Product(12,"The Partner: A Novel","They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ", "Book", 50.00, "USD");
	    productList.add(product1);
	    productList.add(product2);
	    productList.add(product3);
	    productList.add(product4);
	    productList.add(product5);
	    productList.add(product6);
	    productList.add(product7);
	    productList.add(product8);
	    productList.add(product9);
	    productList.add(product10);
	    productList.add(product11);
	    productList.add(product12);
    	
    	coupon1=new Coupons("VFRT5T","Haloween offer","USD","APPLYPERITEM",4,null,0,true,productList,"ITEM",1,4.0,0.0,4.0,25.0);
    	coupon2=new Coupons("GRTYUP","Haloween offer","USD","APPLYONTOTAL",4,null,0,true,new ArrayList<Product>(),"ITEM",1,4.0,0.0,4.0,25.0);
    	couponsList=new ArrayList<Coupons>();
    	couponsList.add(coupon1);
    	couponsList.add(coupon2);
    	
    	
    }
    
    
    @Test
	public void getOrderTest() throws Exception {
		Mockito.when(couponService.getCouponDetails()).thenReturn(couponsList);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/coupons-management-service/coupon/get").accept(
				MediaType.APPLICATION_JSON_VALUE);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String expected = "[{\"couponId\":\"VFRT5T\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYPERITEM\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[{\"productId\":1,\"name\":\"The Whistler\",\"desc\":\" The best thriller writer alive by Ken Follett\",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":2,\"name\":\"The Testament: A Novel\",\"desc\":\"NEW YORK TIMES BESTSELLER\",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":3,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":4,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":5,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":6,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":7,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":8,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":9,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":10,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":11,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"},{\"productId\":12,\"name\":\"The Partner: A Novel\",\"desc\":\"They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; \",\"category\":\"Book\",\"price\":50.0,\"currencyCode\":\"USD\"}],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0},{\"couponId\":\"GRTYUP\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYONTOTAL\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0}]";
		/*System.out.println("Gaurav: "+result.getResponse()
				.getContentAsString());*/
		JSONAssert.assertEquals(result.getResponse()
				.getContentAsString(), expected,false);
	}
    
    
    @Test
	public void modifyCouponTest() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put(
				"/coupons-management-service/coupon/update")
				.accept(MediaType.APPLICATION_JSON)
				.content("{\"couponId\":\"GRTYUP\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYONTOTAL\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0}")
				.contentType(MediaType.APPLICATION_JSON_VALUE);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		Assert.assertEquals(HttpStatus.OK.value(),result.getResponse().getStatus());
	}
    
    @Test
   	public void createCouponTest() throws Exception {
   		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
   				"/coupons-management-service/coupon/create")
   				.accept(MediaType.APPLICATION_JSON)
   				.content("{\"couponId\":\"GRTYUP\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYONTOTAL\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0}")
   				.contentType(MediaType.APPLICATION_JSON_VALUE);
   		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
   		Assert.assertEquals(HttpStatus.OK.value(),result.getResponse().getStatus());
   	}
    
    @Test
   	public void getCouponCodeByIdTest() throws Exception {
    	Mockito.when(couponService.getCouponDetails("GRTYUP")).thenReturn(coupon2);
   		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
   				"/coupons-management-service/coupon/GRTYUP")
   				.accept(MediaType.APPLICATION_JSON)
   				.contentType(MediaType.APPLICATION_JSON_VALUE);
   		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
   		String expected= "{\"couponId\":\"GRTYUP\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYONTOTAL\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0}";
   		Assert.assertEquals(HttpStatus.OK.value(),result.getResponse().getStatus());
   		JSONAssert.assertEquals(result.getResponse()
				.getContentAsString(), expected,false);
   	}
    
   /* @Test
   	public void getCouponCodeByIdTestWrongId() throws Exception {
    	//Mockito.when(couponService.getCouponDetails("GRTYUP")).thenReturn(coupon2);
   		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
   				"/coupons-management-service/coupon/GRTYU")
   				.accept(MediaType.APPLICATION_JSON)
   				.contentType(MediaType.APPLICATION_JSON_VALUE);
   		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
   		String expected= "{\"couponId\":\"GRTYUP\",\"couponDesc\":\"Haloween offer\",\"currency\":\"USD\",\"coupon_type\":\"APPLYONTOTAL\",\"max_redemptions\":4,\"redeemBy\":null,\"usedCount\":0,\"isValid\":true,\"productList\":[],\"applyType\":\"ITEM\",\"excludeFirst\":1,\"maxDiscountPerItem\":4.0,\"maxDiscountOnTotal\":0.0,\"discount\":4.0,\"offsetValue\":25.0}";
   		
   		System.out.println("gsga"+result.getResponse()
				.getContentAsString());Assert.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR.value(),result.getResponse().getStatus());
   		/*JSONAssert.assertEquals(result.getResponse()
				.getContentAsString(), expected,false);
   	}*/
}
