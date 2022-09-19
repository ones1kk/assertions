package com.github.ones1kk.asserts.core.clazz.impl;

import com.github.ones1kk.asserts.core.AbstractAssert;
import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.Asserts;
import com.github.ones1kk.asserts.core.clazz.*;
import com.github.ones1kk.asserts.core.clazz.model.ClassAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClassesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Classes classes = new Classes(asAssert);

        // when
        Class<AbstractClassAssert> supperClass = AbstractClassAssert.class;
        Class<ClassAssert> subClass = ClassAssert.class;
        Class<ClassAssertInterface> interfaceClass = ClassAssertInterface.class;
        Class<AnnotationForTest> annotationClass = AnnotationForTest.class;
        Class<Asserts> finalClass = Asserts.class;
        Class<AbstractAssert> abstractClass = AbstractAssert.class;
        AnonymousClassForTest anonymousClass = new AnonymousClassForTest() {
            @Override
            public void doTest() {

            }
        };
        Class<EnumForTest> enumClass = EnumForTest.class;
        Class<MemberClassForTest> memberClass = MemberClassForTest.class;

        // then
        assertThrows(Exception.class, () -> classes.assertIsTypeOf(supperClass, new String()));
        assertThrows(Exception.class, () -> classes.assertIsNotTypeOf(supperClass, new ClassAssert(supperClass)));
        assertThrows(Exception.class, () -> classes.assertIsSuperclassOf(supperClass, supperClass));
        assertThrows(Exception.class, () -> classes.assertIsSubclassOf(supperClass, subClass));
        assertThrows(Exception.class, () -> classes.assertIsInterface(supperClass));
        assertThrows(Exception.class, () -> classes.assertIsAnnotation(supperClass));
        assertThrows(Exception.class, () -> classes.assertIsFinalClass(supperClass));
        assertThrows(Exception.class, () -> classes.assertIsAbstractClass(supperClass));
        assertThrows(Exception.class, () -> classes.assertIsEnum(supperClass));
        assertThrows(Exception.class, () -> classes.assertIsMemberClass(supperClass));

        assertThatNoException().isThrownBy(() -> {
            classes.assertIsTypeOf(supperClass, new ClassAssert(supperClass));
            classes.assertIsNotTypeOf(supperClass, ClassAssert.class);
            classes.assertIsNotTypeOf(subClass, new String());
            classes.assertIsSuperclassOf(supperClass, ClassAssert.class);
            classes.assertIsSubclassOf(subClass, AbstractClassAssert.class);
            classes.assertIsInterface(interfaceClass);
            classes.assertIsAnnotation(annotationClass);
            classes.assertIsFinalClass(finalClass);
            classes.assertIsAbstractClass(abstractClass);
            classes.assertIsAnonymousClass(anonymousClass.getClass());
            classes.assertIsEnum(enumClass);
            classes.assertIsMemberClass(memberClass);
        });

    }

    static class MemberClassForTest {
    }
}