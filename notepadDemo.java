//NotePad 
import java.awt.*;
import java.awt.event.*;
class Notepad extends Frame
{
	MenuBar mBar;
	Menu mFile,mEdit,mView,mZoom;
	MenuItem mNew,mNewin,mOpen,mSave,mSaveas,mPagesetup,mPage,mExit,mStsBar,mWordWrap,mSep1,mSep2,mSep3,mSep4,mSep5,mSep6,mUndo,mCut,mCopy,mPaste,mDelete,mFind,mFindNext,mFindPrev,mReplace,mGoto,mSelectAll,mTimeDate,mFont,mZoomin,mZoomOut,mRestore;
	TextArea txr;
	public Notepad()
	{
		super("Notepad");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		setSize(500,400);
		setBounds((1366/2)-(500/2),(768/2)-(400/2),500,400);
		setVisible(true);
		txr=new TextArea("Type here");
		mBar=new MenuBar();
		
		mFile=new Menu("File");
		mEdit=new Menu("Edit");
		mView=new Menu("View");
		mZoom=new Menu("Zoom");
		mNew=new MenuItem("New");
		mNewin=new MenuItem("New Window");
		mOpen=new MenuItem("Open");
		mSave=new MenuItem("save");
		mSaveas=new MenuItem("Save as");
		mSep1=new MenuItem("-");
		mPagesetup=new MenuItem("Page setup");
		mPage=new MenuItem("Page");
		mSep2=new MenuItem("-");
		mExit=new MenuItem("Exit");
		mNew=new MenuItem("New");
		mNew=new MenuItem("New");
		mNew=new MenuItem("New");
		
		mUndo=new MenuItem("Undo");
		mSep3=new MenuItem("-");
		mCut=new MenuItem("Cut");
		mCopy=new MenuItem("Copy");
		mPaste=new MenuItem("Paste");
		mDelete=new MenuItem("Delete");
		mSep4=new MenuItem("-");
		mFind=new MenuItem("Find");
		mFindNext=new MenuItem("Find Next");
		mFindPrev=new MenuItem("Find Previous");
		mReplace=new MenuItem("Replace");
		mGoto=new MenuItem("Go to");
		mSep5=new MenuItem("-");
		mSelectAll=new MenuItem("Select all");
		mTimeDate=new MenuItem("Time/Date");
		mSep6=new MenuItem("-");
		mFont=new MenuItem("Font");
		
		mZoomin=new MenuItem("Zoom in");
		mZoomOut=new MenuItem("Zoom out");
		mRestore=new MenuItem("Restore default zoom");
		
		mStsBar=new MenuItem("Status bar");
		mWordWrap=new MenuItem("Word wrap");
		
		add(txr);
		mBar.add(mFile);
		mBar.add(mEdit);
		mBar.add(mView);
		
		mFile.add(mNew);
		mFile.add(mNewin);
		mFile.add(mOpen);
		mFile.add(mSave);
		mFile.add(mSaveas);
		mFile.add(mSep1);
		mFile.add(mPagesetup);
		mFile.add(mPage);
		mFile.add(mSep2);
		mFile.add(mExit);
		
		mEdit.add(mUndo);
		mEdit.add(mSep3);
		mEdit.add(mCut);
		mEdit.add(mCopy);
		mEdit.add(mPaste);
		mEdit.add(mDelete);
		mEdit.add(mSep4);
		mEdit.add(mFind);
		mEdit.add(mFindNext);
		mEdit.add(mFindPrev);
		mEdit.add(mReplace);
		mEdit.add(mGoto);
		mEdit.add(mSep5);
		mEdit.add(mSelectAll);
		mEdit.add(mTimeDate);
		mEdit.add(mSep6);
		mEdit.add(mFont);
		
		mView.add(mZoom);
		mView.add(mStsBar);
		mView.add(mWordWrap);
		
		mZoom.add(mZoomin);
		mZoom.add(mZoomOut);
		mZoom.add(mRestore);
		setMenuBar(mBar);
		
	}

	
	
}
public class notepadDemo
{
	public static void main(String[] args)
	{
		new Notepad();
	}
}