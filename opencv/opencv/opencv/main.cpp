#include <opencv2/opencv.hpp>
#include <iostream>

using namespace cv;
using namespace std;

int main(int argc, char* argv[])
{
	/* 
	** video ��� ����
	** ��ĸ ���� VideoCapture cap(0); ���
	*/
	VideoCapture cap("E:\\opencv\\opencv\\sources\\samples\\data\\vtest.avi");

	//video open ���н� ����
	if (cap.isOpened() == false)
	{
		cout << "Cannot open the video file" << endl;
		cin.get();
		return -1;
	}

	//video ������ �ӵ� ���
	double fps = cap.get(CAP_PROP_FPS);
	cout << "Frames per seconds : " << fps << endl;

	//video�� �� ��â�� ����� �̸� ����
	String window_name = "My First Video";
	namedWindow(window_name, WINDOW_NORMAL);

	while (true)
	{
		//video �� ������ �б�
		Mat frame;
		bool bSuccess = cap.read(frame);

		//video ���κп� ����
		if (bSuccess == false)
		{
			cout << "Found the end of the video" << endl;
			break;
		}

		imshow(window_name, frame);

		//escŰ �Է½� while ����
		if (waitKey(10) == 27)
		{
			cout << "Esc key is pressed by user. Stoppig the video" << endl;
			break;
		}
	}
	return 0;
}