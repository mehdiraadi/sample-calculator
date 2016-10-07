import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import static org.junit.Assert.*;

import org.junit.Test;

public class SampleCalculatorTest {
	private static final Logger LOG=Logger.getLogger(SampleCalculatorTest.class.getName());
	Calculator sc=new Calculator();
	Random r=new Random();
	DecimalFormat df=new DecimalFormat("#.##");

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber=0;
		double secondNumber=0;
		double result=0;
		for(int i=0;i<200;i++){
		firstNumber=Double.valueOf(df.format(r.nextDouble()*10));
		secondNumber=Double.valueOf(df.format(r.nextDouble()*10));
		result=firstNumber+secondNumber;
		LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
		assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
		}
		
	}
	
		public void testAddMediumSizedPositiveNumbers() {
			double firstNumber=0;
			double secondNumber=0;
			double result=0;
			for(int i=0;i<200;i++){
			firstNumber=Double.valueOf(df.format(r.nextDouble()*100));
			secondNumber=Double.valueOf(df.format(r.nextDouble()*100));
			result=firstNumber+secondNumber;
			LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
			assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
			}
		}
			

			
			public void testAddLargeSizedPositiveNumbers() {
				double firstNumber=0;
				double secondNumber=0;
				double result=0;
				for(int i=0;i<200;i++){
				firstNumber=Double.valueOf(df.format(r.nextDouble()*1000));
				secondNumber=Double.valueOf(df.format(r.nextDouble()*1000));
				result=firstNumber+secondNumber;
				LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
				assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
				}
			}
				

				public void testAddSmallSizedNegativeNumbers() {
					double firstNumber=0;
					double secondNumber=0;
					double result=0;
					for(int i=0;i<200;i++){
					firstNumber=Double.valueOf(df.format(r.nextDouble()*-1000));
					secondNumber=Double.valueOf(df.format(r.nextDouble()*-1000));
					result=firstNumber+secondNumber;
					LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
					assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
					}
				}
				
					public void testAddMediumSizedNegativeNumbers() {
						double firstNumber=0;
						double secondNumber=0;
						double result=0;
						for(int i=0;i<200;i++){
						firstNumber=Double.valueOf(df.format(r.nextDouble()*-100));
						secondNumber=Double.valueOf(df.format(r.nextDouble()*-100));
						result=firstNumber+secondNumber;
						LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
						assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
						}
					}
						
					
					
		

                      public void testAddLargeSizedNegativeNumbers() {
						double firstNumber=0;
						double secondNumber=0;
						double result=0;
						for(int i=0;i<200;i++){
						firstNumber=Double.valueOf(df.format(r.nextDouble()*-10));
						secondNumber=Double.valueOf(df.format(r.nextDouble()*-10));
						result=firstNumber+secondNumber;
						LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
						assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
						}
                        }
                      public void testSubtractSmallSizedpositiveNumbers() {
  						double firstNumber=0;
  						double secondNumber=0;
  						double result=0;
  						for(int i=0;i<200;i++){
  						firstNumber=Double.valueOf(df.format(r.nextDouble()*10));
  						secondNumber=Double.valueOf(df.format(r.nextDouble()*10));
  						result=firstNumber-secondNumber;
  						LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
  						assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
  						}
                          }
                      public void testSubtractMediumSizedPositiveNumbers() {
  						double firstNumber=0;
  						double secondNumber=0;
  						double result=0;
  						for(int i=0;i<200;i++){
  						firstNumber=Double.valueOf(df.format(r.nextDouble()*100));
  						secondNumber=Double.valueOf(df.format(r.nextDouble()*100));
  						result=firstNumber-secondNumber;
  						LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
  						assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
  						}
                          }
                      public void testSubtractLargeSizedPositiveNumbers() {
  						double firstNumber=0;
  						double secondNumber=0;
  						double result=0;
  						for(int i=0;i<200;i++){
  						firstNumber=Double.valueOf(df.format(r.nextDouble()*1000));
  						secondNumber=Double.valueOf(df.format(r.nextDouble()*1000));
  						result=firstNumber-secondNumber;
  						LOG.info("Testing the method add with"+firstNumber+"and"+secondNumber);
  						assertEquals(Math.round(sc.add(firstNumber, secondNumber)),Math.round(result));
  						}
                          }
}
