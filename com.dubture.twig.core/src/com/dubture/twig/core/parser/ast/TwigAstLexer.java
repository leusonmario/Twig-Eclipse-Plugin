/* The following code was generated by JFlex 1.2.2 on 2/10/12 10:13 PM */

/*******************************************************************************
 * This file is part of the Twig eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
/* --------------------------Usercode Section------------------------ */

package com.dubture.twig.core.parser.ast;   

import java_cup.runtime.*;
import java_cup.sym;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.informatik.tu-muenchen.de/~kleing/jflex/">JFlex</a> 1.2.2
 * on 2/10/12 10:13 PM from the specification file
 * <tt>file:/Users/sobert/Documents/workspaces/main/Twig-Eclipse-Plugin/com.dubture.twig.core/Resources/parserTools/parser/ast_scanner.jflex</tt>
 */
public class TwigAstLexer implements java_cup.runtime.Scanner {

  /** this character denotes the end of file */
  final public static int YYEOF = -1;

  /** lexical states */
  final public static int ST_TWIG_BLOCK_NAME = 3;
  final public static int ST_TWIG_VAR = 1;
  final public static int ST_DOUBLE_QUOTES = 4;
  final public static int YYINITIAL = 0;
  final public static int ST_BACKQUOTE = 4;
  final public static int ST_TWIG_BLOCK = 2;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\2\6\2\0\1\6\22\0\1\14\1\0\1\10\2\0\1\3"+
    "\1\0\1\21\1\16\1\17\2\0\1\15\1\0\1\7\1\0\12\5"+
    "\5\0\1\12\1\0\1\4\1\20\20\4\1\4\7\4\1\0\1\11"+
    "\2\0\1\4\1\0\1\4\1\20\20\4\1\13\7\4\1\1\1\0"+
    "\1\2\1\0\201\4\uff00\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    18,    36,    54,    72,    90,   108,   126,   144,   162, 
      180,   198,   144,   216,   144,   144,   234,   252,   270,   144, 
      288,   306,   324,   144,   144,   342,   144,   216,   144,   360, 
      252,   378,   144,   144
  };

  /** 
   * The packed transition table of the DFA
   */
  final private static String yy_packed = 
    "\1\6\1\7\12\6\1\10\5\6\2\11\1\12\1\11"+
    "\1\13\1\11\1\14\1\15\1\16\2\11\1\13\1\14"+
    "\1\11\1\17\1\20\1\21\1\22\3\11\1\23\1\13"+
    "\1\11\1\14\1\15\1\16\2\11\1\13\1\14\1\24"+
    "\1\17\1\20\1\21\1\22\4\11\1\25\1\11\1\26"+
    "\1\15\3\11\1\25\1\26\3\11\1\25\23\11\1\6"+
    "\1\27\21\6\1\30\1\6\1\31\6\6\2\0\7\6"+
    "\1\32\20\6\24\0\1\33\23\0\2\13\5\0\1\13"+
    "\4\0\1\13\7\0\1\14\5\0\1\14\5\0\10\34"+
    "\1\35\1\36\10\34\4\0\2\13\2\0\1\34\2\0"+
    "\1\13\4\0\1\13\12\37\1\40\7\37\1\35\2\0"+
    "\1\41\23\0\2\25\5\0\1\25\4\0\1\25\7\0"+
    "\1\26\5\0\1\26\5\0\1\6\1\0\1\6\1\0"+
    "\6\6\2\0\7\6\1\0\1\6\1\0\6\6\1\0"+
    "\1\42\6\6\7\0\1\34\21\0\1\37\12\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack(yy_packed);


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  0,  0,  0,  1,  1,  1,  9,  1,  1,  1,  9,  1,  9,  9, 
     1,  1,  1,  9,  1,  1,  0,  9,  9,  0,  9,  0,  9,  0,  0,  0, 
     9,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[16384];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL;

  /** yy_atEOF == true <=> the scanner has returned a value for EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
       
    protected int getTokenStartPosition() {
        return yy_startRead - yy_pushbackPos;
    }
    
    protected int getTokenLength() {
        return yy_markedPos - yy_startRead;
    }

    
       
    private Symbol symbol(int type) {
    
		int leftPosition = getTokenStartPosition();    
        return new Symbol(type, leftPosition, leftPosition + getTokenLength());
    }
    
    private Symbol fullSymbol(int type) {

        Symbol symbol = symbol(type);
        symbol.value = yytext();
        return symbol;    
    }
    
    public boolean isEOF() {
        return yy_atEOF;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TwigAstLexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TwigAstLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the unpacked transition table
   */
  private static int [] yy_unpack(String packed) {
    int [] trans = new int[396];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 238) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return trans;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 88) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Gets the next input character.
   *
   * @return      the next character of the input stream, EOF if the
   *              end of the stream is reached.
   * @exception   IOException  if any I/O-Error occurs
   */
  private int yy_advance() throws java.io.IOException {

    /* standard case */
    if (yy_currentPos < yy_endRead) return yy_buffer[yy_currentPos++];

    /* if the eof is reached, we don't need to work hard */ 
    if (yy_atEOF) return YYEOF;

    /* otherwise: need to refill the buffer */

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if ( numRead == -1 ) return YYEOF;

    yy_endRead+= numRead;

    return yy_buffer[yy_currentPos++];
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */
    yy_reader.close();
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }

  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }

  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    try {
      System.out.println(YY_ERROR_MSG[errorCode]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(YY_ERROR_MSG[YY_UNKNOWN_ERROR]);
    }

    System.exit(1);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number) {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;


    while (true) {

      boolean yy_counted = false;
      for (yy_currentPos = yy_startRead; yy_currentPos < yy_markedPos;
                                                      yy_currentPos++) {
        switch (yy_buffer[yy_currentPos]) {
        case '\r':
          yyline++;
          yy_counted = true;
          break;
        case '\n':
          if (yy_counted)
            yy_counted = false;
          else {
            yyline++;
          }
          break;
        default:
          yy_counted = false;
        }
      }

      if (yy_counted) {
        if ( yy_advance() == '\n' ) yyline--;
        if ( !yy_atEOF ) yy_currentPos--;
      }

      yy_action = -1;

      yy_currentPos = yy_startRead = yy_markedPos;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          yy_input = yy_advance();

          if ( yy_input == YYEOF ) break yy_forAction;

          int yy_next = yytrans[ yy_rowMap[yy_state] + yycmap[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = YY_ATTRIBUTE[yy_state];
          if ( (yy_attributes & 1) > 0 ) {
            yy_action = yy_state; 
            yy_markedPos = yy_currentPos; 
            if ( (yy_attributes & 8) > 0 ) break yy_forAction;
          }

        }
      }


      switch (yy_action) {    

        case 28: 
          { 
    return fullSymbol(ParserConstants.T_CONSTANT_ENCAPSED_STRING);
 }
        case 35: break;
        case 5: 
        case 6: 
        case 7: 
        case 33: 
          { 
	// raw content
	return symbol(ParserConstants.T_INLINE_HTML);
 }
        case 36: break;
        case 12: 
          { 
	// do nothing
 }
        case 37: break;
        case 10: 
        case 16: 
          { 
        return fullSymbol(ParserConstants.T_VARIABLE);    
     }
        case 38: break;
        case 20: 
          { 
        yybegin(ST_TWIG_BLOCK);
        return fullSymbol(ParserConstants.T_BLOCK_NAME);
     }
        case 39: break;
        case 32: 
          {   
        yybegin(YYINITIAL);
        return symbol(ParserConstants.TWIG_STMT_CLOSE);
     }
        case 40: break;
        case 26: 
          {   
        yybegin(YYINITIAL);
        return symbol(ParserConstants.TWIG_VAR_CLOSE);
     }
        case 41: break;
        case 24: 
          {  
        yybegin(ST_TWIG_BLOCK_NAME);
        return symbol(ParserConstants.TWIG_STMT_OPEN);
     }
        case 42: break;
        case 23: 
          {  
        yybegin(ST_TWIG_VAR);
        return symbol(ParserConstants.TWIG_VAR_OPEN);
     }
        case 43: break;
        case 21: 
          {  /* just skip what was found, do nothing */  }
        case 44: break;
        case 11: 
        case 19: 
          {  
     
     }
        case 45: break;
        case 14: 
          {  return symbol(ParserConstants.T_OPEN_PARENTHESE);  }
        case 46: break;
        case 15: 
          {  return symbol(ParserConstants.T_CLOSE_PARENTHESE);  }
        case 47: break;
        case 8: 
        case 9: 
        case 13: 
        case 17: 
        case 18: 
          { System.out.print(yytext()); }
        case 48: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }    

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, i.e. it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    for (int i = 0; i < argv.length; i++) {
      TwigAstLexer scanner = null;
      try {
        scanner = new TwigAstLexer( new java.io.FileReader(argv[i]) );
      }
      catch (java.io.FileNotFoundException e) {
        System.out.println("File not found : \""+argv[i]+"\"");
        System.exit(1);
      }
      catch (java.io.IOException e) {
        System.out.println("Error opening file \""+argv[i]+"\"");
        System.exit(1);
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Usage : java TwigAstLexer <inputfile>");
        System.exit(1);
      }

      try {
        while ( !scanner.yy_atEOF ) scanner.next_token();
      }
      catch (java.io.IOException e) {
        System.out.println("An I/O error occured while scanning :");
        System.out.println(e);
        System.exit(1);
      }
      catch (Exception e) {
        e.printStackTrace();
        System.exit(1);
      }
    }
  }


}
