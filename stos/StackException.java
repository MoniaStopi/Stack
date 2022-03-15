package stos;

enum ErrCode
{
    STACK_OVERFLOW(2), STACK_IS_EMPTY(1), OTHER_ERROR(0);
    private int mCode;

    ErrCode( int code )
    {
        mCode = code;
    }
}

public class StackException extends Exception {
	
	private ErrCode mErrCode;
    public StackException( ErrCode errCode )
    {
        mErrCode = errCode;
    }

    public void showReason()
    {
        switch( mErrCode )
        {
            case STACK_OVERFLOW: System.err.println("\nStack overflow!!\n"); break;
            case STACK_IS_EMPTY: System.err.println("\nStack is empty!!\n"); break;
            default:
                System.out.println("\nOther error!!\n"); break;
        }
    }

    public String getReason()
    {
        switch( mErrCode )
        {
            case STACK_OVERFLOW: return "\nStack overflow!!\n";
            case STACK_IS_EMPTY: return "\nStack is empty!!\n";
            default:
                return "\nUnknown error!!\n";
        }
    }

}
