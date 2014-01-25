package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_fn__7568_fn__7572 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "make-buffer-blob");
 }
 Object this1;
 Object mode8;
 Object s05;
 Object s6;
 Object white_space7;
 public pprint_pretty_writer_fn__7568_fn__7572(final Object this1, final Object mode8, final Object s05, final Object s6, final Object white_space7) {
  super();
  this.this1 = this1;
  this.mode8 = mode8;
  this.s05 = s05;
  this.s6 = s6;
  this.white_space7 = white_space7;
 }
 public java.lang.Object invoke() {
  if (clojure.lang.Util.equiv(((java.lang.Object)this.mode8), ((java.lang.Object)const__1))) {
   ((IFn)const__2.getRawRoot()).invoke(this.this1);
   Reflector.invokeInstanceMethod(RT.get(((IFn)const__4.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{this.s6});
   return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.this1), const__6.getRawRoot(), const__7, this.white_space7);
  } else {
   {
    Object oldpos1 = RT.get(((IFn)const__4.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
    Object newpos2 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)oldpos1), (long)clojure.lang.RT.count(((java.lang.Object)this.s05))));
    ((IFn)const__5.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this.this1), const__6.getRawRoot(), const__8, newpos2);
    return ((IFn)const__11.getRawRoot()).invoke(this.this1, ((IFn)const__12.getRawRoot()).invoke(this.s6, this.white_space7, oldpos1, newpos2));
   }
  }
 }
}
