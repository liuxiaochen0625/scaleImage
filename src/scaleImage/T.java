package scaleImage;

public class T {


	public static void main(String[] args) {

		JpegTool j = new JpegTool();
		try {
			j.SetScale(0.7);
			j.SetSmallHeight(100);
			j.doFinal("E:\\reus.jpg","E:\\0.jpg");
		} catch (JpegToolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

