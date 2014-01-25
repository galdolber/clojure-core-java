package clojure;

import clojure.lang.*;

public final class main_skip_whitespace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Keyword const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__2 = (java.lang.Object)Character.valueOf((char)10);
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "line-start");
  const__4 = (java.lang.Object)(-1L);
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "stream-end");
  const__6 = (java.lang.Object)Character.valueOf((char)59);
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__8 = (java.lang.Object)Character.valueOf((char)44);
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "body");
 }
 public main_skip_whitespace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object c2 = Reflector.invokeNoArgInstanceMember(s1, "read");
   while(true) {
    if (clojure.lang.Util.equiv(((java.lang.Object)c2), (long)clojure.lang.RT.intCast(((java.lang.Object)const__2)))) {
     return const__3;
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)c2), (long)-1L)) {
      return const__5;
     } else {
      if (clojure.lang.Util.equiv(((java.lang.Object)c2), (long)clojure.lang.RT.intCast(((java.lang.Object)const__6)))) {
       Reflector.invokeNoArgInstanceMember(s1, "readLine");
       return const__3;
      } else {
       Object __r4444 = null;
       boolean or__3968__auto__3 = java.lang.Character.isWhitespace((char)clojure.lang.RT.charCast(((java.lang.Object)c2)));
       Object __r4445;
       if (or__3968__auto__3) {
        __r4445 = or__3968__auto__3;
       } else {
        __r4445 = clojure.lang.Util.equiv(((java.lang.Object)c2), (long)clojure.lang.RT.intCast(((java.lang.Object)const__8)));
       }
       if ((java.lang.Boolean)__r4445) {
        java.lang.Object c2___aux = Reflector.invokeNoArgInstanceMember(s1, "read");
        c2 = c2___aux;
        continue;
       } else {
        Object __r4447 = const__9;
        if (__r4447 != null && !(__r4447 == Boolean.FALSE)) {
         Reflector.invokeInstanceMethod(s1, "unread", new Object[]{c2});
         return const__10;
        } else {
         return null;
        }
       }
      }
     }
    }
   }
  }
 }
}
