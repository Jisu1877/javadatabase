package SwingProject;

public class NuriManageVO {
	private int mIdx;
	private String mName;
	private String mMid;
	private int mPwd;
	private String mHint;
	private String mHintAns;
	
	public int getmIdx() {
		return mIdx;
	}
	public void setmIdx(int mIdx) {
		this.mIdx = mIdx;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmMid() {
		return mMid;
	}
	public void setmMid(String mMid) {
		this.mMid = mMid;
	}
	public int getmPwd() {
		return mPwd;
	}
	public void setmPwd(int mPwd) {
		this.mPwd = mPwd;
	}
	public String getmHint() {
		return mHint;
	}
	public void setmHint(String mHint) {
		this.mHint = mHint;
	}
	public String getmHintAns() {
		return mHintAns;
	}
	public void setmHintAns(String mHintAns) {
		this.mHintAns = mHintAns;
	}
	@Override
	public String toString() {
		return "NuriManageVO [mIdx=" + mIdx + ", mName=" + mName + ", mMid=" + mMid + ", mPwd=" + mPwd + ", mHint="
				+ mHint + ", mHintAns=" + mHintAns + "]";
	}
	
}
