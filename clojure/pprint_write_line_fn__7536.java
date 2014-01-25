package clojure;

import clojure.lang.*;

public final class pprint_write_line_fn__7536 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "buffer");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "tokens-fit?");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "write-token-string");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
 }
 Object this1;
 public pprint_write_line_fn__7536(final Object this1) {
  super();
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  {
   Object buffer1 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "buffer"));
   while(true) {
    ((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__3.getRawRoot(), const__0, ((IFn)const__4.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY, buffer1));
    Object __r4942 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this.this1, buffer1));
    if (__r4942 != null && !(__r4942 == Boolean.FALSE)) {
     {
      Object new_buffer2 = ((IFn)const__7.getRawRoot()).invoke(this.this1, buffer1);
      Object __r4944 = ((IFn)const__5.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)buffer1), ((java.lang.Object)new_buffer2)) ? Boolean.TRUE : Boolean.FALSE));
      if (__r4944 != null && !(__r4944 == Boolean.FALSE)) {
       java.lang.Object buffer1___aux = new_buffer2;
       buffer1 = buffer1___aux;
       continue;
      } else {
       return null;
      }
     }
    } else {
     return null;
    }
   }
  }
 }
}
