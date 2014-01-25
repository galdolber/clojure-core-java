package clojure;

import clojure.lang.*;

public final class pprint_readable_character extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "char-format");
  const__6 = (java.lang.Object)Character.valueOf((char)111);
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "cl-format");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__9 = (java.lang.Object)Character.valueOf((char)117);
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public pprint_readable_character() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77284 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object c5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77284), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77284), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    Object pred__77297 = const__4.getRawRoot();
    Object expr__77308 = RT.get(params1, Keyword.intern(null, "char-format"));
    Object __r5219 = ((IFn)pred__77297).invoke(const__6, expr__77308);
    if (__r5219 != null && !(__r5219 == Boolean.FALSE)) {
     ((IFn)const__7.getRawRoot()).invoke(Boolean.TRUE, "\\o~3,'0o", Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)c5))));
    } else {
     Object __r5221 = ((IFn)pred__77297).invoke(const__9, expr__77308);
     if (__r5221 != null && !(__r5221 == Boolean.FALSE)) {
      ((IFn)const__7.getRawRoot()).invoke(Boolean.TRUE, "\\u~4,'0x", Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)c5))));
     } else {
      Object __r5223 = ((IFn)pred__77297).invoke(null, expr__77308);
      if (__r5223 != null && !(__r5223 == Boolean.FALSE)) {
       ((IFn)const__10.get()).invoke(c5);
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__11.getRawRoot()).invoke("No matching clause: ", expr__77308))));
      }
     }
    }
   }
   return navigator6;
  }
 }
}
