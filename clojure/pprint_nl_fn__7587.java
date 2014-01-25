package clojure;

import clojure.lang.*;

public final class pprint_nl_fn__7587 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "buffering");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "make-nl-t");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
 }
 Object this1;
 Object type2;
 public pprint_nl_fn__7587(final Object this1, final Object type2) {
  super();
  this.this1 = this1;
  this.type2 = type2;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__2.getRawRoot(), const__3, const__4);
  {
   Object pos1 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
   return ((IFn)const__6.getRawRoot()).invoke(this.this1, ((IFn)const__7.getRawRoot()).invoke(this.type2, RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-blocks")), pos1, pos1));
  }
 }
}
