package CyberTest;

import org.junit.Test;

public class CyberTestRun {

		@Test
		public void setRegister() {
			RegisterScene register = new RegisterScene();
			register.Register();
			register.setRegister();
		}
		 
		@Test
		public void Frame() {
			FrameScene frame = new FrameScene();
			frame.setFrame();
			frame.Frame();
		}
		
		@Test
		public void setDatePickerDisable() {
			DatePickerScene DateDisable = new DatePickerScene();
			DateDisable.DatePickerDisable("1999", "December", "3");
		}
		
		@Test
		public void setDatePickerEnable() {
			DatePickerScene DateEnable = new DatePickerScene();
			DateEnable.DataPickerEnable();
		}
		
		@Test
		public void setSlider() {
			SliderScene Slider = new SliderScene();
			Slider.Slider();
		}
		
		
		
		
}
