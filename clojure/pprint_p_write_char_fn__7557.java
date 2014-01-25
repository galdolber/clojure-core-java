package clojure;

import clojure.lang.*;

public final class pprint_p_write_char_fn__7557 extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "make-buffer-blob");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "char");
 }
 Object this1;
 Object oldpos3;
 Object newpos4;
 Object c2;
 public pprint_p_write_char_fn__7557(final Object this1, final Object oldpos3, final Object newpos4, final Object c2) {
  super();
  this.this1 = this1;
  this.oldpos3 = oldpos3;
  this.newpos4 = newpos4;
  this.c2 = c2;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__2.getRawRoot(), const__3, this.newpos4);
  return ((IFn)const__4.getRawRoot()).invoke(this.this1, ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(Character.valueOf(clojure.lang.RT.charCast(((java.lang.Object)this.c2)))), null, this.oldpos3, this.newpos4));
 }
}
