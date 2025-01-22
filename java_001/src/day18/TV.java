package day18;

class TV {
	   int size;
	   String manufacturer;
	   public TV() {
		  size = 32;
		  manufacturer = "LG";
		  System.out.println(size+"인치 "+manufacturer);
	   }
	   public TV(String manufacturer) {
		  this.size = 32;
		  this.manufacturer = manufacturer;
		  System.out.println(size+"인치 "+manufacturer);
	   }
	   public TV(int size, String manufacturer) {
		  this.size = size;
		  this.manufacturer = manufacturer;
		  System.out.println(size+"인치 "+manufacturer);
	   }
	}
