package com.aduppil.adupp;

import java.util.Arrays;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Contents extends Activityclass { 
public int imgID = 0;
public int nameID = 0;
public int recpID= 0;
public int i=0;
//public String[] menuname = {"NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA"}; 
public String[] menuname= new String[30];
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	i=0;
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.bakery_contents);
	
	Bundle b = getIntent().getExtras();
	String  categoryname = b.getString("id");
	Toast.makeText(this, categoryname, Toast.LENGTH_SHORT).show();
	ImageView imgcat = (ImageView)findViewById(R.id.imageheading);
	AdView adView = (AdView) this.findViewById(R.id.adView);
	AdRequest adRequest = new AdRequest.Builder().build();
	adView.loadAd(adRequest);

	if (categoryname.equals("bakery"))
	{
		 final String[] catname={"blackforest","chakkavaruthath","datesball","datesroll","fruit_cake","gulabjamun","jangiri","laddo","marble_cake","murukk","mysore_pak","nankatta","rasagula"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	
	}
	else if(categoryname.equals("soup"))
	{
		final String[] catname={"chicken_noodle_soup","mutton_soup","sweetcorn_soup","sweetnsour_soup","tomat_soup","vegetable_soup"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("chicken"))
	{
		final String[] catname={"chicken_capsicum","chicken_mally_fry","chicken_mugalayi","chicken_mustard_tikka","chicken_noodles","chicken_putheena_tikka","chicken_soya","chicken_spstew","chicken_stew","chilly_chicken","chilly_chillychicken","hyderab_chicken_curry","kanakafry_chicken","malabari_chicken","pepper_chicken"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("vegetable"))
	{
		final String[] catname={"aaloo_palak","aviyal","beetroot_fry","chennamasala","daal_paalak","gobi_manjooriyan","kaalan","kadalapariip_thoran","kootcurry","masala_potato_thoran","moorkaachiyath","oolan","paalak_paneer","paneer_mattar_masala","puliyinji","vayuthannega_pachadi","vegetable_kuruma","vegetable_nut_curry","vellari_pachady","vendakka_stew","venda_meyukk"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("pickle"))
	{
		final String[] catname={"bilambi_pickle","carrot_pickle","dates_pickle","kallumakka","lime_pickle","lime_skin_pickle","mangasurukka_pickle","mangavattiya_pickle"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("rice"))
	{
		final String[] catname={"chicken_kabsa","chicken_rice","coconut_rice","fish_dum_biriyani","fried_rice","ghee_rice","meen_rice","mutton_dum_biriyani","tomato_rice","vegetable_biriyani","vegetable_pulav"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("pudding"))
	{
		final String[] catname={"banana_chocolate","biscupudding","bread_pudding","butterscotch_icecream","ilaneer_pudding","mango_pudding","pineapple_creamy_pudding","pineapple_orange_creamy","pista_kulfi"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("fish"))
	{
		final String[] catname={"fish_moli","koonthal_spefry","mathy_kappa","meen_aanam","meen_char","meen_chuttath","meen_mulakittath","meen_pollichath","meen_roast","meen_stew"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("meat"))
	{
		final String[] catname={"beefvarattiyath","beef_kuruma","beef_macroni","kkakrotty","mutton_mappas","mutton_stew"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("prawns"))
	{
		final String[] catname={"prawns_gemsrotti","prawns_noodels","prawns_pepper_stew","prawns_puyungalarotti","prawns_roast","prawns_unda","prawns_varattiyath","tharichor"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("roti"))
	{
		final String[] catname={"aloo_porotta","butterfruit_porotta","ghee_roast","kubbos","nan","neriyari_dosa","putheena_porotta","vellayappam","wheat_porotta"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("snacks"))
	{
		final String[] catname={"beef_cutlet","bonda","carrot_pola","chattypathiry","cheese_sammosa","cheese_veg_franky","kaati_roll","kadalakka_pola","kaiveeshal","noodle_chickball","paanipoori","pakkvada","pav_baaji","pizza","showerma","spring_roll","tharippola","turkey_pathil","unnakkayi","uzhunnuvada","vegetable_cutlet","wonderful_basket"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("drinks"))
	{
		final String[] catname={"date_badaam_shake","dreamwipp_salsa","mango_lassy","sharjah_shake","snickers_delight","strawbeery_lassi"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("salad"))
	{
		final String[] catname={"russian_alad","kacchambar","kolslaw","sweet_corn_salad"}; 
		Arrays.sort(catname);
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	else if(categoryname.equals("launcher"))
	{
		 	
		aduppfavourites= getSharedPreferences("Na",MODE_PRIVATE);
		final String[] catname=aduppfavourites.getAll().keySet().toArray(new String[0]);
		//final String[] catname={"dreamwipp_salsa","kolslaw","russian_alad","chattypathiry"}; 
		 for(int i=0;i<catname.length;i++)
		 {
			 menuname[i]=catname[i];
		 }
	}
	imgID = getResources().getIdentifier("ic_" + categoryname, "drawable", "com.aduppil.adupp");
	 imgcat.setImageResource(imgID);
	 ImageButton[] but = new  ImageButton [menuname.length];
    but[i]=(ImageButton)findViewById(R.id.imageButton1);
   imgID = getResources().getIdentifier("it_" + menuname[i], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
   			intent_next.putExtra("id", menuname[0]);
   			Contents.this.startActivity(intent_next);
   	}
       
       });
       
   	i+=1;
 if (menuname.length > 1)
	 
 { but[i]=(ImageButton)findViewById(R.id.imageButton2);
	  imgID = getResources().getIdentifier("it_" + menuname[i], "drawable", "com.aduppil.adupp");
	  but[i].setImageResource(imgID);
	  but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[1]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {	but[i]=(ImageButton)findViewById(R.id.imageButton3);
	   imgID = getResources().getIdentifier("it_" + menuname[2], "drawable", "com.aduppil.adupp");
	   but[i].setImageResource(imgID);
	   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[2]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {     but[i]=(ImageButton)findViewById(R.id.imageButton4);
	   imgID = getResources().getIdentifier("it_" + menuname[3], "drawable", "com.aduppil.adupp");
	   but[i].setImageResource(imgID);
	   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[3]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  but[i]=(ImageButton)findViewById(R.id.imageButton5); 
imgID = getResources().getIdentifier("it_" + menuname[4], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[4]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {   but[i]=(ImageButton)findViewById(R.id.imageButton6);
	   imgID = getResources().getIdentifier("it_" + menuname[5], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[5]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {    but[i]=(ImageButton)findViewById(R.id.imageButton7);
	   imgID = getResources().getIdentifier("it_" + menuname[6], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[6]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {     but[i]=(ImageButton)findViewById(R.id.imageButton8);
	   imgID = getResources().getIdentifier("it_" + menuname[7], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[7]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   { 
	   but[i]=(ImageButton)findViewById(R.id.imageButton9);
	   imgID = getResources().getIdentifier("it_" + menuname[8], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[8]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton10);
	   imgID = getResources().getIdentifier("it_" + menuname[9], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[9]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton11);
	   imgID = getResources().getIdentifier("it_" + menuname[10], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[10]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton12);
	   imgID = getResources().getIdentifier("it_" + menuname[11], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[11]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton13);
	   imgID = getResources().getIdentifier("it_" + menuname[12], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[12]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton14);
	   imgID = getResources().getIdentifier("it_" + menuname[13], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[13]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton15);
	   imgID = getResources().getIdentifier("it_" + menuname[14], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[14]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton16);
	   imgID = getResources().getIdentifier("it_" + menuname[15], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[15]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton17);
	   imgID = getResources().getIdentifier("it_" + menuname[16], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[16]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton18);
	   imgID = getResources().getIdentifier("it_" + menuname[17], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[17]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton19);
	   imgID = getResources().getIdentifier("it_" + menuname[18], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[18]);
			Contents.this.startActivity(intent_next);
	}
   
   }); 
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton20);
	   imgID = getResources().getIdentifier("it_" + menuname[19], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[19]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton21);
	   imgID = getResources().getIdentifier("it_" + menuname[20], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[20]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton22);
	   imgID = getResources().getIdentifier("it_" + menuname[21], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[21]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton23);
	   imgID = getResources().getIdentifier("it_" + menuname[22], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[22]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton24);
	   imgID = getResources().getIdentifier("it_" + menuname[23], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[23]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton25);
	   imgID = getResources().getIdentifier("it_" + menuname[24], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[24]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton26);
	   imgID = getResources().getIdentifier("it_" + menuname[25], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[25]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton27);
	   imgID = getResources().getIdentifier("it_" + menuname[26], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[26]);
			Contents.this.startActivity(intent_next);
	}
   
   });
   i+=1;
   if (menuname.length > i)
   {  
	   but[i]=(ImageButton)findViewById(R.id.imageButton28);
	   imgID = getResources().getIdentifier("it_" + menuname[27], "drawable", "com.aduppil.adupp");
   but[i].setImageResource(imgID);
   but[i].setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent_next= new Intent(Contents.this,ConfectioneryMenu.class);
			intent_next.putExtra("id", menuname[27]);
			Contents.this.startActivity(intent_next);
	}
   
   });}}}}}
   }}
   }
   }}}}}
   }
   }
   
   }
   }
   }
   }
   }}}}}}}}
 
}
}