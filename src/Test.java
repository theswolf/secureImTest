import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import core.september.textmesecure.R;
import core.september.textmesecure.SignIn;

public class Test extends android.test.ActivityUnitTestCase<SignIn> {

	private int buttonId;
	private int usernameId;
	private int passwordId;
	private SignIn activity;

	public Test() {
		super(SignIn.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),
				Test.class);
		startActivity(intent, null, null);
		activity = getActivity();
	}
	
	public void testSigniIn() {
		buttonId = core.september.textmesecure.R.id.registerButton;
		usernameId = core.september.textmesecure.R.id.loginEdit;
		passwordId = core.september.textmesecure.R.id.passwordEdit;
		Button signUpButton = (Button) activity.findViewById(buttonId);
        //Button cancelButton = (Button) findViewById(R.id.cancel_signUp);
        EditText usernameText = (EditText)  activity.findViewById(usernameId);
        EditText passwordText = (EditText) activity.findViewById(passwordId);  
        
        signUpButton.performClick();
	}

}