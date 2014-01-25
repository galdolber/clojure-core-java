package clojure;

import clojure.lang.*;

public final class xml_fn__6926_push_chars__6930 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "chars");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "complement");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.xml", "*sb*");
  const__7 = (clojure.lang.Var)RT.var("clojure.xml", "*current*");
 }
 Object push_content1;
 public xml_fn__6926_push_chars__6930(final Object push_content1) {
  super();
  this.push_content1 = push_content1;
 }
 public java.lang.Object invoke() {
  Object __r4522 = null;
  {
   boolean and__3966__auto__1 = clojure.lang.Util.equiv(((java.lang.Object)const__1.get()), ((java.lang.Object)const__2));
   Object __r4523;
   if (and__3966__auto__1) {
    __r4523 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(new clojure.xml_fn__6926_push_chars__6930_fn__6931()), ((IFn)const__5.getRawRoot()).invoke(const__6.get()));
   } else {
    __r4523 = (and__3966__auto__1 ? Boolean.TRUE : Boolean.FALSE);
   }
   __r4522 = __r4523;
  }
  Object __r4524 = __r4522;
  if (__r4524 != null && !(__r4524 == Boolean.FALSE)) {
   return const__7.set(((IFn)this.push_content1).invoke(const__7.get(), ((IFn)const__5.getRawRoot()).invoke(const__6.get())));
  } else {
   return null;
  }
 }
}
