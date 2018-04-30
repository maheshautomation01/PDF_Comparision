

import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;


public class ClassFirst {
	
	public static void main(String[] args) throws Exception {
		
		String source6_2file = "C:\\Users\\C20222\\Desktop\\Papyrus\\6.2 - Copy\\SalePoint_WVR_62_FORMNO2557.pdf";
		String source7_1file = "C:\\Users\\C20222\\Desktop\\Papyrus\\7.2 - Copy\\SalePoint_WVR_71_FORMNO2557.pdf";
		String FinalResult = "C:\\Users\\C20222\\Desktop\\Papyrus\\PDFResult\\"+ "SalePoint_WVR_62_A05FORM2373B_ComparisionResult.pdf";
		String ignoreFile= "C:\\Mahesh- WVO\\Automation\\SeleniumAutomation\\LUNA Type\\PDF_Comparison\\ignore.conf,";
		
		//new PdfComparator(source6_2file, source7_1file).withIgnore(ignoreFile).compare().writeTo(FinalResult);
				
		final CompareResult result = new PdfComparator(source6_2file, source7_1file).compare();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA===================================="+result);
		if (result.isNotEqual()) {
		    System.out.println("The Difference Found" + result.getNumberOfPages());
		}
		if (result.isEqual()) {
		    System.out.println("No Differences found!" + result.toString());
		}
		if (result.hasDifferenceInExclusion()) {
		    System.out.println("Only Differences in excluded areas found!" + result.toString());
		}
		
		
		boolean isEquals = new PdfComparator(source6_2file, source7_1file).withIgnore(ignoreFile).compare().writeTo(FinalResult);
		System.out.println("Both V6.2 & V7.1 are similar ??  == " +isEquals);
		
		System.out.println("Comparison is done");
		
		
		
	}
	
	public void filecount(){
		
		
		
		
	}

}
