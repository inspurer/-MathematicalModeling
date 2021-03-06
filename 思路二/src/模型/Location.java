/**
 * 原创声明:csu_xiaotao@163.com
 */
package 模型;

/**
 * 新建类声明
 * @author csu_xiaotao
 *<a href = "https://github.com/inspurer">月小水长</a>
 * 下午4:01:44
 * 2018年5月16日
 */
public class Location {
	//Longitude 经度
	public double Longtitude;
	//Latitude 纬度
	public double Lattitude;
	//true为宿主站,flase为子站
	public boolean flag = false;
	//构造函数
	public Location(double Longtitude,double Lattitude,boolean flag) {
		this.flag = flag;
		this.Longtitude = Longtitude;
		this.Lattitude = Lattitude;
	}
	//缺省参数flag的构造函数
	public Location(double Longtitude,double Lattitude) {
		this.Longtitude = Longtitude;
		this.Lattitude = Lattitude;
	}
}