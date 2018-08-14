class Weekdays{
	public static void main(String[] args) {
		int daynum=3;
		String day=" ";

		switch(daynum){
			case 1:
			day="monday";
			break;
			case 2:
			day="tuesday";
			break;
			case 3:
			day="wednesday";
			break;
			case 4:
			day="thursday";
			break;
			case 5:
			day="friday";
			break;
			case 6:
			day="saturday";
			break;
			case 7:
			day="sunday";
			break;
			default:
			System.out.println("input is invalid");
			}
			System.out.println(day);
		}

	}
