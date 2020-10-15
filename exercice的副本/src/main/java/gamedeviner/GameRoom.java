package gamedeviner;

import java.util.Scanner;

public class GameRoom {
	// 属性 参与游戏的玩家 房间号
	private HumanPlayer player1 = null;
	private ComPlayer player2 = null;
	private long roomID;
	private String roomName;
	private long roomPassword;

	public GameRoom(String roomID, String roomPass, String roomName) {
		if (!("admin".equals(roomID) && "123".contentEquals(roomPass))) {
			System.out.println("用户名错误");
			;
		}
		this.setRoomName(roomName);
		initGame();
		starGame();
		endGame();
	}

	// 方法 开始游戏 初始化游戏 显示菜单 选择人物 判断输赢（可以定义在裁判类中）
	public void initGame() {
		// 1实例化游戏玩家对象 选择角色

		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		// 2初始话游戏的其他属性，如游戏中的花花草草等
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n游戏加载成功");
	}

	public void starGame() {
		showMenu();
		choiceRole();
		gaming();
		// 如果返回-1，玩家1胜利；返回0打平。返回1玩家2胜利
		// 打印结果
	}

	private void gaming() {
		while (true) {
			System.out.print(player1.getName()+"请出拳:");
			// 双方出拳
			player1.setFist(new Scanner(System.in).nextInt());
			int fist1 = player1.getFist();
			player2.getFist();
			int fist2 = player2.getFist();
			// 判断输赢
			int result = judge(fist1, fist2);// 调用方法判断结果
			if (result == -1) {
				System.out.println("【老师说】" + player1.getName() + "win" + player1.getScore());
				player1.sendMessage(HumanPlayer.MessageTypeWin);
				player2.sendMessage(ComPlayer.MessageTypeLose);
			} else if (result == 0) {
				System.out.println("【老师说】平局" + player2.getScore() + player1.getScore());
				player1.sendMessage(HumanPlayer.MessageTypeFist);
				player2.sendMessage(ComPlayer.MessageTypeFist);
			} else {
				System.out.println("【老师说】" + player2.getName() + "win" + player2.getScore());
				player2.sendMessage(HumanPlayer.MessageTypeWin);
				player1.sendMessage(HumanPlayer.MessageTypeLose);
			}
			System.out.println("continue?");
			String answer = new Scanner(System.in).next();
			if ("n".equalsIgnoreCase(answer)) {
				break;
			}
		}
	}

	public void showMenu() {
		
		System.out.println("欢迎进入（" + getRoomName() + ")游戏房间");
		System.out.println("出拳规则：1剪刀2布3石头");
	}

	public void choiceRole() {
		System.out.println("对方角色1 风2尼3正奶4啊呆");
		System.out.println("请选择角色");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = { "风", "尼", "正奶", "啊呆" };
		player2.setName(nameArray[choice - 1]);
		player1.setName("小新");
		System.out.println(player1.getName() + "VS." + player2.getName());
	}

	public int judge(int fist1, int fist2) {
		if (fist1 == fist2) {
			return 0;
		}
		if (fist1 == 1 && fist2 == 3 || fist1 == 2 && fist2 == 1 || fist1 == 3 & fist2 == 2) {
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
			return -1;
		} else {
			player1.setScore(player1.getScore() - 1);
			player2.setScore(player2.getScore() + 1);
			return 1;
		}
	}

	public void endGame() {
		System.out.println("游戏结束");

	}

	public long getRoomID() {
		return roomID;
	}

	public void setRoomID(long roomID) {
		this.roomID = roomID;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public long getRoomPassword() {
		return roomPassword;
	}

	public void setRoomPassword(long roomPassword) {
		this.roomPassword = roomPassword;
	}

}
