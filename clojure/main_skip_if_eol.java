package clojure;

import clojure.lang.*;

public final class main_skip_if_eol extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__2 = (java.lang.Object)Character.valueOf((char)10);
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "line-start");
  const__4 = (java.lang.Object)(-1L);
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "stream-end");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "body");
 }
 public main_skip_if_eol() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object c2 = Reflector.invokeNoArgInstanceMember(s1, "read");
   if (clojure.lang.Util.equiv(((java.lang.Object)c2), (long)clojure.lang.RT.intCast(((java.lang.Object)const__2)))) {
    return const__3;
   } else {
    if (clojure.lang.Util.equiv(((java.lang.Object)c2), (long)-1L)) {
     return const__5;
    } else {
     Object __r4439 = const__6;
     if (__r4439 != null && !(__r4439 == Boolean.FALSE)) {
      Reflector.invokeInstanceMethod(s1, "unread", new Object[]{c2});
      return const__7;
     } else {
      return null;
     }
    }
   }
  }
 }
}
