public class Shopp{
	public static void main(String[] args) {
		System.out.println("-----商城库存清单----");
		System.out.println("品牌    尺寸    价格    库存数");
		String macBrand = "MacBookPro";
		double macSize = 13.3;
		double macPrice = 12000.88;
		int    macCount = 5;
		System.out.println(macBrand+"    "+macSize+"    "+macPrice+"    "+macCount);
		System.out.println("总库存："+macCount);
		System.out.println("总价格："+macPrice*macCount);

	}
}