package clojure;

import clojure.lang.*;

public final class pprint_add_to_buffer_fn__7539 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "buffer");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "tokens-fit?");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "write-line");
 }
 Object token2;
 Object this1;
 public pprint_add_to_buffer_fn__7539(final Object token2, final Object this1) {
  super();
  this.token2 = token2;
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__2.getRawRoot(), const__3, ((IFn)const__4.getRawRoot()).invoke(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "buffer")), this.token2));
  Object __r4946 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this.this1, RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "buffer"))));
  if (__r4946 != null && !(__r4946 == Boolean.FALSE)) {
   return ((IFn)const__7.getRawRoot()).invoke(this.this1);
  } else {
   return null;
  }
 }
}
