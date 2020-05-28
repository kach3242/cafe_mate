#include <opencv2/opencv.hpp>
#include <iostream>

using namespace cv;
using namespace std;

int main(int argc, char* argv[])
{
	/* 
	** video 경로 지정
	** 웹캡 사용시 VideoCapture cap(0); 사용
	*/
	VideoCapture cap("E:\\opencv\\opencv\\sources\\samples\\data\\vtest.avi");

	//video open 실패시 종료
	if (cap.isOpened() == false)
	{
		cout << "Cannot open the video file" << endl;
		cin.get();
		return -1;
	}

	//video 프레임 속도 얻기
	double fps = cap.get(CAP_PROP_FPS);
	cout << "Frames per seconds : " << fps << endl;

	//video를 열 새창을 만들고 이름 설정
	String window_name = "My First Video";
	namedWindow(window_name, WINDOW_NORMAL);

	while (true)
	{
		//video 새 프레임 읽기
		Mat frame;
		bool bSuccess = cap.read(frame);

		//video 끝부분에 종료
		if (bSuccess == false)
		{
			cout << "Found the end of the video" << endl;
			break;
		}

		imshow(window_name, frame);

		//esc키 입력시 while 종료
		if (waitKey(10) == 27)
		{
			cout << "Esc key is pressed by user. Stoppig the video" << endl;
			break;
		}
	}
	return 0;
}