package springxmlcontent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingMessageRender extends JFrame implements MessageRender {
	private MessageProvider message;

	public SwingMessageRender() {
	}

	@Override
	public void render() {
		setSize(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel label = new JLabel(message.getMessage());
		add(label);
		setVisible(true);
	}

	@Override
	public void setMessage(MessageProvider mProvider) {
		this.message = mProvider;
	}
}
